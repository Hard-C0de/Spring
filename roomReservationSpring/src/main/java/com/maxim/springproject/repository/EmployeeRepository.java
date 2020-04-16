package com.maxim.springproject.repository;

import com.maxim.springproject.model.RoomDao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository //хранилище методов
public interface EmployeeRepository extends CrudRepository<RoomDao, Long> {

    @Override
    List<RoomDao> findAll();

    @Override
    Optional<RoomDao> findById(Long aLong);

    @Override
    void deleteById(Long aLong);



    @Override
    void deleteAll();
}
