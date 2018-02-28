/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputgrades;

/**
 *
 * @author jdani
 */
public class Student {
    private int studentID;
  private CollegeCourse[] course = new CollegeCourse[4];

  // get methods
  public int getStudentID()
  {
    return studentID;
  }
  public CollegeCourse getCourse(int p)
  {
    return course[p];
  }
  public void setStudentID(int i)
  {
    studentID = i;
  }
  public void setCourse(CollegeCourse c, int p)
  {
    course[p] = c;
  }  
    
}
