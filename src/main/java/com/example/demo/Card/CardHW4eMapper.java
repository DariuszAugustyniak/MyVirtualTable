package com.example.demo.Card;


import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CardHW4eMapper {


    @Insert("INSERT INTO CardWH4e_header (name, game_class, race) VALUES(#{name}, #{gameClass}, #{race})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(CardWH4e cardWH4e);

    @Select("SELECT id, name, game_class, race FROM CardWH4e_header WHERE id = #{id}")
    CardWH4e findById(long id);

    @Select("SELECT id, name, game_class, race FROM CardWH4e_header")
    List<CardWH4e> findAll();

    @Select("SELECT * FROM CardWH4e_header INNER JOIN CardWH4e_basic_skills ON CardWH4e_header.id=CardWH4e_basic_skills.header_id WHERE CardWH4e_header.id = #{id} ")
    CardWH4e findFullCardById(long id);

    @Results(id = "characteristicNameMap", value = {
            @Result(property = "id", column = "ID"),
            @Result(property = "name", column = "NAME"),
            @Result(property="characteristicNameMap", column="ID", javaType= List.class, many=@Many(select="selectCharacteristics"))
    })
    @Select("SELECT id, name FROM CardWH4e_header WHERE id = #{id}")
    CardWH4e findBasicSkillsById(long id);

    @Select("SELECT * FROM CardWH4e_single_characteristic WHERE header_id = #{header_id}")
    @Results(value = {
            @Result(property="name", column="name"),
            @Result(property="initial", column="initial"),
            @Result(property="advancement", column="advancement"),
            @Result(property="current", column="current")})
    List<CardWH4eCharacteristic> selectCharacteristics(long header_id);
}
