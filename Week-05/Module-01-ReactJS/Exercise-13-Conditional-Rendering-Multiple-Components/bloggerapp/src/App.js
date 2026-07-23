import BookDetails from "./components/BookDetails";
import BlogDetails from "./components/BlogDetails";
import CourseDetails from "./components/CourseDetails";

function App() {

    const showBooks = true;
    const showBlogs = true;
    const showCourses = true;

    let bookSection;

    // Conditional Rendering using if...else
    if (showBooks) {
        bookSection = <BookDetails />;
    } else {
        bookSection = <p>No Book Details Available</p>;
    }

    return (

        <div
            style={{
                fontFamily: "Arial",
                padding: "30px"
            }}
        >

            <h1
                style={{
                    textAlign: "center",
                    marginBottom: "30px"
                }}
            >
                Blogger Application
            </h1>

            <div
                style={{
                    display: "flex",
                    justifyContent: "space-evenly",
                    alignItems: "flex-start"
                }}
            >

                {/* Book Details - if...else */}
                <div style={{ width: "30%" }}>
                    {bookSection}
                </div>

                <div
                    style={{
                        width: "2px",
                        backgroundColor: "green",
                        minHeight: "250px"
                    }}
                />

                {/* Blog Details - Ternary */}
                <div style={{ width: "30%" }}>
                    {
                        showBlogs
                            ? <BlogDetails />
                            : <p>No Blog Details Available</p>
                    }
                </div>

                <div
                    style={{
                        width: "2px",
                        backgroundColor: "green",
                        minHeight: "250px"
                    }}
                />

                {/* Course Details - Logical AND */}
                <div style={{ width: "30%" }}>
                    {
                        showCourses && <CourseDetails />
                    }
                </div>

            </div>

        </div>

    );

}

export default App;