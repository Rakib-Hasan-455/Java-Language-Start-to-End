public class CallByValueAndReferenceMain {
    public void showCallByValue(int objValue){
        System.out.println("Call by Value = " +objValue);
    }

    public void showCallByReference(CallByValueAndReferenceClass referenceValue){
        System.out.println("Call by Reference = "  +referenceValue.getX());
    }

    public static void main(String[] args) {
        CallByValueAndReferenceMain obj1 = new CallByValueAndReferenceMain();
        int x = 5;
        obj1.showCallByValue(x);

        CallByValueAndReferenceClass objV1 = new CallByValueAndReferenceClass();
        CallByValueAndReferenceClass objV2 = new CallByValueAndReferenceClass();

        obj1.showCallByValue(objV1.getX());
        obj1.showCallByValue(objV2.getX());

        objV1.setX(20);
        objV2.setX(30);

        obj1.showCallByReference(objV1);
        obj1.showCallByReference(objV2);
    }
}
