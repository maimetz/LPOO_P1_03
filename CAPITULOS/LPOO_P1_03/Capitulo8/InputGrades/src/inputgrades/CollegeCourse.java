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
public class CollegeCourse {
    private String id;
  private int creditos;
  private char calif;
  
  
  // get methods
  public String getCourseID()
  {
    return id;
  }
  public int getCreditHours()
  {
    return creditos;
  }
  public char getLetterGrade()
  {
    return calif;
  } 
  
  // set methods
  public void setCourseID(String i)
  {
    id = i;
  }
  public void setCreditHours(int c)
  {
    creditos = c;
  }
  public void setLetterGrade(char l)
  {
    calif = l;
  }
}