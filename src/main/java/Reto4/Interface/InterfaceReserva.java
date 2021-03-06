/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto4.Interface;

import Reto4.Entidades.Reservas;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Alex Mosquera
 */
public interface InterfaceReserva extends CrudRepository<Reservas, Integer> {

    public List<Reservas> findAllByStatus(String status);

    public List<Reservas> findAllByStartDateAfterAndStartDateBefore(Date dateOne, Date dateTwo);

    // SELECT clientid, COUNT(*) AS total FROM reservacion group by clientid order by desc;
    @Query("SELECT c.client, COUNT(c.client) from Reservas AS c group by c.client order by COUNT(c.client)DESC")
    public List<Object[]> countTotalReservationsByClient();

}
