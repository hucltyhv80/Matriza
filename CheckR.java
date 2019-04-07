package foo;

public enum CheckR {
    RIBOA,
    NRIBOA;

    public boolean check(){
        if(this == RIBOA){
            return true;
        }else if(this == NRIBOA){
            return false;
        }
        return false;
    }
}
