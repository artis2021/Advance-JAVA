import java.lang.reflect.Method;

public class AnnotationUse {
    public static void main(String[] args) {
        AnnotationUse obj = new AnnotationUse();
//        obj.sayHello();
        try{
            Method methodVal = obj.getClass().getMethod("sayHello");
            AnnotationDeclaration annotationDeclaration = methodVal.getAnnotation(AnnotationDeclaration.class);
            System.out.println("val of the annotation is: "+ annotationDeclaration.val());

        } catch (Exception e){
            e.printStackTrace();
        }



    }

    @AnnotationDeclaration(val = 10)
    public void sayHello(){
        System.out.println("Hello world.");
    }
}
