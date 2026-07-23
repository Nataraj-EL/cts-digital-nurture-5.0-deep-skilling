function BookDetails() {

    const books = [
        {
            id: 1,
            title: "Clean Code",
            author: "Robert C. Martin"
        },
        {
            id: 2,
            title: "Effective Java",
            author: "Joshua Bloch"
        }
    ];

    return (

        <div>

            <h2>Book Details</h2>

            <ul>

                {
                    books.map(book => (

                        <li key={book.id}>
                            <b>{book.title}</b> - {book.author}
                        </li>

                    ))
                }

            </ul>

        </div>

    );

}

export default BookDetails;