import React, { useState } from "react";
import BookDetails from "./components/BookDetails";
import BlogDetails from "./components/BlogDetails";
import CourseDetails from "./components/CourseDetails";

function App() {
  const [view, setView] = useState("books");

  const books = [
    { id: 1, title: "React in Action", author: "Mark T." },
    { id: 2, title: "Learning JavaScript", author: "Ethan B." },
  ];

  const blogs = [
    { id: 1, title: "React Hooks", content: "Introduction to Hooks..." },
    { id: 2, title: "JSX Deep Dive", content: "Understanding JSX..." },
  ];

  const courses = [
    { id: 1, name: "React Basics", duration: "3 weeks" },
    { id: 2, name: "Advanced React", duration: "5 weeks" },
  ];

  let content;

  // Way 1: Using if-else
  if (view === "books") {
    content = <BookDetails books={books} />;
  } else if (view === "blogs") {
    content = <BlogDetails blogs={blogs} />;
  } else if (view === "courses") {
    content = <CourseDetails courses={courses} />;
  }

  // Way 2: Using ternary operator
  const headerColor = view === "blogs" ? "blue" : "black";

  return (
    <div style={{ fontFamily: "Arial", padding: "20px" }}>
      <h1 style={{ color: headerColor }}>📖 Blogger App</h1>

      {/* Way 3: Logical AND operator */}
      {view !== "courses" && <p>You're not viewing courses right now.</p>}

      {/* Buttons to switch views */}
      <div style={{ marginBottom: "15px" }}>
        <button onClick={() => setView("books")}>Show Books</button>
        <button onClick={() => setView("blogs")}>Show Blogs</button>
        <button onClick={() => setView("courses")}>Show Courses</button>
      </div>

      {/* Render selected content */}
      {content}
    </div>
  );
}

export default App;
