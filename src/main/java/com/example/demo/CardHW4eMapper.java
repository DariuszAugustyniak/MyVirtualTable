package com.example.demo;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CardHW4eMapper {


    @Insert("INSERT INTO CardHW4e (name, game_class) VALUES(#{name}, #{game_class})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(CardWH4e cardWH4e);

    @Select("SELECT id, name, game_class FROM CardHW4e WHERE id = #{id}")
    CardWH4e findById(long id);

    @Select("SELECT id, name, game_class FROM CardHW4e")
    List<CardWH4e> findAll();
}
