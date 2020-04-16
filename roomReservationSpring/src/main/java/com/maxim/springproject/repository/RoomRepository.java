package com.maxim.springproject.repository;

import com.maxim.springproject.model.RoomDao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository//хранилище методов
public interface RoomRepository extends CrudRepository<RoomDao, Long> {

    @Override
    List<RoomDao> findAll();

    @Override
    Optional<RoomDao> findById(Long aLong);

    List<RoomDao> findAllByFloorAndSize(int floor,int size);

    List<RoomDao> findAllByFloorAndSizeGreaterThanEqual(int floor,int size);


    @Override
    <S extends RoomDao> S save(S s);




    @Override
    void deleteById(Long aLong);

}
