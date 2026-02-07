package ProblemsPackage;

public class Problems {
    private String name;
    private String description;
    private ProblemType type;
    private boolean status;

    public  Problems(String name, String description, ProblemType type) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.status = false;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type.toString();
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
