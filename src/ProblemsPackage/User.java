package ProblemsPackage;

import java.util.ArrayList;
import java.util.List;

public class User {

    private List<Problems> problems = new ArrayList<>();

    public void  addProblem(Problems problem)
    {
        problems.add(problem);

    }

    public void solveProblem(Problems problem){
        problem.setStatus(true);
    }

    public List<Problems> getUnsolvedProblems() {
        List<Problems> unsolved = new ArrayList<>();
        for (Problems problem : problems) {
            if (!problem.isStatus()) {
                unsolved.add(problem);
            }
        }
        return unsolved;
    }
    public int getNumberOfProblems(List<Problems> problems) {

        return problems.size();
    }

}
