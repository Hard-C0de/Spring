package com.maxim.springproject.service;

import com.maxim.springproject.model.RoomDao;
import com.maxim.springproject.repository.RoomRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.RouteMatcher;

import java.util.List;

@Service//содержит бизнес-логику и вызывает методы из хранилища
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {// инжектим в roomservice т.е. связываем RoomRepository с RoomService
        this.roomRepository = roomRepository;
    }

    public List<RoomDao> retriveAll() { //извлечь все и проверить не пусты ли комнаты

        System.out.println("");

        List<RoomDao> all = roomRepository.findAll();//все найденные переменные засовываем в лист all

        if( CollectionUtils.isEmpty( all ) ) {
            System.out.println("PUSTO");
        } else {
            System.out.println(all);
        }
        return all;
    }
    public String removeAll(){
      roomRepository.deleteAll();
        return "Operation complete." ;


    }

    public List<RoomDao> findByFS(int floor,int size) {
        return roomRepository.findAllByFloorAndSizeGreaterThanEqual(floor, size);
    }

    public void bookAroom(Long roomId){
        RoomDao room = roomRepository.findById(roomId).get();
        room.setAvailable(false);
        roomRepository.save(room);
    }

}
