package dev.coms4156.project.individualproject;

import java.io.Serial;
import java.io.Serializable;
import java.util.Map;

/**
 * Represents a department within an educational institution. This class stores information about
 * the department, including its code, courses offered, department chair, and number of majors.
 */
public class Department implements Serializable {

  /**
   * Constructs a new Department object with the given parameters.
   *
   * @param deptCode        The code of the department.
   * @param courses         A HashMap containing courses offered by the department.
   * @param departmentChair The name of the department chair.
   * @param numberOfMajors  The number of majors in the department.
   */
  public Department(
      String deptCode, Map<String, Course> courses, String departmentChair, int numberOfMajors) {
    if (deptCode == null || courses == null || departmentChair == null || numberOfMajors < 0) {
      throw new IllegalArgumentException(
          " Department not created, Arguments should not be null or <0 ");
    }
    this.courses = courses;
    this.departmentChair = departmentChair;
    this.numberOfMajors = numberOfMajors;
    this.deptCode = deptCode;
  }

  /**
   * Gets the number of majors in the department.
   *
   * @return The number of majors.
   */
  public int getNumberOfMajors() {
    return this.numberOfMajors;
  }

  /**
   * Gets the name of the department chair.
   *
   * @return The name of the department chair.
   */
  public String getDepartmentChair() {
    return this.departmentChair;
  }

  /**
   * Gets the courses offered by the department.
   *
   * @return A HashMap containing courses offered by the department.
   */
  public Map<String, Course> getCourseSelection() {
    return this.courses;
  }

  /**
   * Increases the number of majors in the department by one.
   */
  public void addPersonToMajor() {
    this.numberOfMajors++;
  }

  /**
   * Decreases the number of majors in the department by one if it's greater than zero.
   */
  public void dropPersonFromMajor() {

    if (this.numberOfMajors > 0) {
      this.numberOfMajors--;
    }
  }

  /**
   * Adds a new course to the department's course selection.
   *
   * @param courseId The ID of the course to add.
   * @param course   The Course object to add.
   */
  public void addCourse(String courseId, Course course) {
    if (course == null) {
      throw new NullPointerException("Course is null");
    }
    this.courses.put(courseId, course);
  }

  /**
   * Creates and adds a new course to the department's course selection.
   *
   * @param courseId       The ID of the new course.
   * @param instructorName The name of the instructor teaching the course.
   * @param courseLocation The location where the course is held.
   * @param courseTimeSlot The time slot of the course.
   * @param capacity       The maximum number of students that can enroll in the course.
   */
  public void createCourse(
      String courseId,
      String instructorName,
      String courseLocation,
      String courseTimeSlot,
      int capacity) {
    Course newCourse = new Course(instructorName, courseLocation, courseTimeSlot, capacity);
    this.addCourse(courseId, newCourse);
  }

  /**
   * Returns a string representation of the department, including its code and the courses offered.
   *
   * @return A string representing the department.
   */
  @Override
  public String toString() {
    if (courses == null) {
      throw new NullPointerException("Courses is null");
    }
    StringBuilder result = new StringBuilder();
    for (Map.Entry<String, Course> entry : this.courses.entrySet()) {
      String key = entry.getKey();
      Course value = entry.getValue();
      result
          .append(deptCode)
          .append(" ")
          .append(key)
          .append(": ")
          .append(value.toString())
          .append("\n");
    }
    return result.toString();
  }

  @Serial
  private static final long serialVersionUID = 234567L;

  /**
   * All the courses at the department.
   */
  private Map<String, Course> courses;

  /**
   * The department's chair.
   */
  private String departmentChair;

  /**
   * String that Represents the department.
   */
  private String deptCode;

  /**
   * Total number of majors in the department currently.
   */
  private int numberOfMajors;
}
