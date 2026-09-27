package project.api;
import project.annotations.NetworkAPIPrototype;

public class UserComputeAPIPrototype {
    @NetworkAPIPrototype
    public void userComputation(UserComputeAPI api) {
        api.userComputation("", ' ', "");
    }
}
