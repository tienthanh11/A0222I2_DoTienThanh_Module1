package service;

import model.House;
import model.Room;
import model.Villa;

import java.util.List;

public interface IServiceService {
    List<House> showHouse();

    List<Room> showRoom();

    List<Villa> showVilla();

    void createHouse(House house);

    void createVilla(Villa villa);

    void createRoom(Room room);
}
