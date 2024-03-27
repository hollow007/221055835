/*@author Joshua Mokwebo 222191562
  Day : 27 March 2024
  Time : 2:00PM
  GitHub Account :Fluffy-J Joshua@mycput
  GitHub repository :mystudentregistrationapplication
*/


package za.ac.cput.repository;

import za.ac.cput.domain.Lecturer;

import java.util.List;

public interface ILecturerRepository extends IRepository<Lecturer , String> {
    List<Lecturer> getall();
}
