package demo.java.maven.demo;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.util.List;

@Mojo(name = "mojoTest", defaultPhase = LifecyclePhase.PACKAGE)
public class MojoTest extends AbstractMojo {

    @Parameter
    private String msg;

    @Parameter
    private List<String> ops;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println("mojo test........" + msg);
        ops.forEach(System.out::println);
    }
}
