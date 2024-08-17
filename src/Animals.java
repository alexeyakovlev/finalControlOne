import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Animals {
    private String name;
    private List<String> commands;

    public Animals(String name) {
        this.name = name;
        this.commands = new ArrayList<>();
    }

    public void addCommand(String command) {
        commands.add(command);
    }

    public List<String> getCommands() {
        return commands;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", commands=" + commands +
                '}';
    }
}
