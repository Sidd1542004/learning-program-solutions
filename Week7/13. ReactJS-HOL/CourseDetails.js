import React from "react";

const CourseDetails = ({ courses }) => {
  return (
    <div>
      <h2>🎓 Course Details</h2>
      <ul>
        {courses.map((course) => (
          <li key={course.id}>
            <strong>{course.name}</strong> - {course.duration}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default CourseDetails;
