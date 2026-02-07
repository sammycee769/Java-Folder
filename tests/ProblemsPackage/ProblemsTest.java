package ProblemsPackage;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ProblemsTest {
    @Test
    public void problemIsCreatedCorrectly() {
        Problems problem = new Problems("No money","Lack of capital", ProblemType.FINANCIAL);
        assertEquals("No money", problem.getName());
        assertEquals("Lack of capital", problem.getDescription());
        assertEquals("FINANCIAL", problem.getType());
        assertFalse(problem.isStatus());
    }
    @Test
    public void iCreateAProblemCorrectly_AndICanSolveIt(){
        Problems problem = new Problems("No money","Lack of capital", ProblemType.EDUCATIONAL);
        problem.setStatus(true);
        assertTrue(problem.isStatus());
    }
    @Test
    public void userCanAddProblemsToMyProblems(){
        User user =  new User();
        List<Problems> unsolved = user.getUnsolvedProblems();
        assertEquals(0,user.getNumberOfProblems(unsolved));

        Problems problem = new Problems("No money","Lack of capital", ProblemType.TECHNICAL);
        user.addProblem(problem);
        unsolved = user.getUnsolvedProblems();
        assertEquals(1,user.getNumberOfProblems(unsolved));
    }
    @Test
    public void userCanCreateAProblem_AndCanSolveIt(){
        User user = new User();
        List<Problems> unsolved = user.getUnsolvedProblems();
        assertEquals(0,user.getNumberOfProblems(unsolved));

        Problems problem = new Problems("No money","Lack of capital", ProblemType.EDUCATIONAL);
        user.addProblem(problem);
        user.solveProblem(problem);
        unsolved = user.getUnsolvedProblems();
        assertEquals(0,user.getNumberOfProblems(unsolved));
    }
    @Test
    public void userCanCreateMultipleProblems_AndCanRecount(){
        User user = new User();
        List<Problems> unsolved = user.getUnsolvedProblems();
        assertEquals(0,user.getNumberOfProblems(unsolved));

        Problems problemOne = new Problems("No money","Lack of capital", ProblemType.EDUCATIONAL);
        Problems problemTwo = new Problems("No skill","Lack Of Human Capital Development", ProblemType.TECHNICAL);
        user.addProblem(problemOne);
        user.addProblem(problemTwo);
        unsolved = user.getUnsolvedProblems();
        assertEquals(2,user.getNumberOfProblems(unsolved));
        user.solveProblem(problemOne);
        unsolved = user.getUnsolvedProblems();
        assertEquals(1,user.getNumberOfProblems(unsolved));

    }
    @Test
    public void UserCanCheckProblemsUsingTheName(){
        User user = new User();
        List<Problems> unsolved = user.getUnsolvedProblems();
        assertEquals(0,user.getNumberOfProblems(unsolved));

        Problems problem = new Problems("No money","Lack of capital", ProblemType.EDUCATIONAL);
        user.addProblem(problem);
        unsolved = user.getUnsolvedProblems();
        assertEquals(1,user.getNumberOfProblems(unsolved));

        assertEquals("No money", problem.getName());
    }
    @Test
    public void UserCanCheckProblemsUsingTheDescription(){
        User user = new User();
        List<Problems> unsolved = user.getUnsolvedProblems();
        assertEquals(0,user.getNumberOfProblems(unsolved));

        Problems problem = new Problems("No money","Lack of capital", ProblemType.EDUCATIONAL);
        user.addProblem(problem);
        unsolved = user.getUnsolvedProblems();
        assertEquals(1,user.getNumberOfProblems(unsolved));

        assertEquals("Lack of capital", problem.getDescription());
    }
}
