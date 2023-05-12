package advance__java;

class ComplexClass {
    float real, imaginary;
    ComplexClass(float real,float imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    ComplexClass add(ComplexClass b){
        float r=this.real+b.real;
        float im=this.imaginary+b.imaginary;
        return new ComplexClass(r, im);
    }

    public static void main(String[] args) {
        ComplexClass a=new ComplexClass(2, 1);
    }
}