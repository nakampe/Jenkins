package  co.za.nakampe.wwwdot;

public class SetswanaGreeting implements Greeting {

private String message;

public SetswanaGreeting(String message){
this.message= message;
}

@Override
public String getMessage(){
return message;
}

}
