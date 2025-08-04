import React from "react";

const BlogDetails = ({ blogs }) => {
  return (
    <div>
      <h2>📝 Blog Details</h2>
      <ul>
        {blogs.map((blog) => (
          <li key={blog.id}>
            <strong>{blog.title}</strong> - {blog.content}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default BlogDetails;
