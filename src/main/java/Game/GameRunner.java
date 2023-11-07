package Game;

public class GameRunner {
    public static void main(String[] args) {
        Schoolar sch1 = new Schoolar("Arina", 8);
        Schoolar sch2 = new Schoolar("Sophia", 15);

        Student std1 = new Student("Yarik", 20);
        Student std2 = new Student("Bocman", 22);
        Student std3 = new Student("Loman", 20);
        Student std4 = new Student("Captain", 22);

        Employee emp1 = new Employee("Artur", 35);
        Employee emp2 = new Employee("Andrew", 33);

        Team<Schoolar> schTeam = new Team<>("Dragons");
        schTeam.addNewParticipant(sch1);
        schTeam.addNewParticipant(sch2);
        Team<Student> stdTean = new Team<>("Kyrsoviki");
        stdTean.addNewParticipant(std1);
        stdTean.addNewParticipant(std2);
        Team<Student> stdTean2 = new Team<>("Brodyagi");
        stdTean2.addNewParticipant(std3);
        stdTean2.addNewParticipant(std4);

        Team<Employee> empTeam = new Team<>("Workers");
        empTeam.addNewParticipant(emp1);
        empTeam.addNewParticipant(emp2);

        stdTean.playWith(stdTean2);


    }
}
