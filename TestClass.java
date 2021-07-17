public class TestClass {
    private String asd = "This is asd";    

    public TestClass(){        
    }

    public TestClass(String asdParam){
        asd = asdParam;
    }
    
    public String getAsd(){
        return asd;
    }

    public void setAsd(){
        asd = "This is not asd";
    }
}
