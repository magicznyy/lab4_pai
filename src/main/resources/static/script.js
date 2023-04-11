async function showAllStudents() {

  console.log("showing all students");
    const response = await fetch("http://localhost:8080/students");
    console.log(response);
}


async function addStudent() {



}