function CourseDetails() {

    const courses = [
        "React",
        "Spring Boot",
        "Java Programming"
    ];

    return (

        <div>

            <h2>Course Details</h2>

            <ul>

                {
                    courses.map((course, index) => (

                        <li key={index}>
                            {course}
                        </li>

                    ))
                }

            </ul>

        </div>

    );

}

export default CourseDetails;