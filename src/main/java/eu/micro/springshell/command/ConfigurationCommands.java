package eu.micro.springshell.command;

import lombok.extern.slf4j.Slf4j;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@Slf4j
@ShellComponent
public class ConfigurationCommands {

    @ShellMethod(value = "Convert configuration to last version", group = "Configuration commands")
    public boolean convert(@ShellOption(value = {"-p", "--path"}, help = "the absolute path to the json path to convert to latest version")String absolutePath) {
        log.warn("yo bro you should put some code here");
        return absolutePath.equals("true");
    }
}
