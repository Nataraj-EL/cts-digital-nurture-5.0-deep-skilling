import React from "react";
import Post from "./Post";
import "./Posts.css";

class Posts extends React.Component {

    constructor(props) {
        super(props);

        this.state = {
            posts: []
        };
    }

    loadPosts() {
        fetch("https://jsonplaceholder.typicode.com/posts")
            .then(response => response.json())
            .then(data => {

                const posts = data.map(
                    post => new Post(post.id, post.title, post.body)
                );

                this.setState({
                    posts: posts
                });

            });
    }

    componentDidMount() {
        this.loadPosts();
    }

    componentDidCatch(error, info) {
        alert(error);
        console.error(error, info);
    }

    render() {
        return (
            <div className="container">

                <h1 className="heading">
                    Blog Posts
                </h1>

                {
                    this.state.posts.map(post => (
                        <div className="post-card" key={post.id}>

                            <h2 className="post-title">
                                {post.title}
                            </h2>

                            <p className="post-body">
                                {post.body}
                            </p>

                        </div>
                    ))
                }

            </div>
        );
    }
}

export default Posts;