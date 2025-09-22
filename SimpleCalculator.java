Class SimpleCalculator{
	public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      System.out.println("Simple Calculator");
      System.out.println("Enter two numbers and operator (+, -, *, /).");
      System.out.println("Press ESC key or write 'exit' to exit.\n");
      while (true) {
         if (System.in.available() > 0) {
            int key = System.in.read();
            if (key == 27 ) { // ASCII code for ESC
               System.out.println("Closing Calculator...");
               break;
            }
         }
         System.out.print("Enter first number: ");
         String firstInput = sc.next();
         if (firstInput.equalsIgnoreCase("exit")) {
            System.out.println("Closing Calculator...");
            break;
         }
         double num1 = Double.parseDouble(firstInput);
         System.out.print("Enter operator (+, -, *, /): ");
         String opInput = sc.next();
         if (opInput.equalsIgnoreCase("exit")) {
            System.out.println("Closing Calculator...");
            break;
         }
         char op = opInput.charAt(0);
         System.out.print("Enter second number: ");
         String secondInput = sc.next();
         if (secondInput.equalsIgnoreCase("exit")) {
            System.out.println("Closing Calculator...");
            break;
         }
         double num2 = Double.parseDouble(secondInput);
         double result = 0;
         boolean valid = true;
         switch (op) {
            case '+': result = add(num1, num2); break;
            case '-': result = subtract(num1, num2); break;
            case '*': result = multiply(num1, num2); break;
            case '/':
               if (num2 != 0) result = divide(num1, num2);
               else {
                  System.out.println("Not Divisible by Zero!");
                  valid = false;
               }
               break;
            default:
               System.out.println("Invalid operator!");
               valid = false;
         }
         if (valid) {
            if (result == (int) result) System.out.println("Result: " + (int) num1 + " " + op +" "+ (int) num2 + " = " + (int) result + "\n");
            else System.out.println("Result: "+num1 + " " + op +" "+ num2 + " = " + result + "\n");
         }
      }
   }
   public static double add(double a, double b) { return a + b; }
   public static double subtract(double a, double b) { return a - b; }
   public static double multiply(double a, double b) { return a * b; }
   public static double divide(double a, double b) { return a / b; }
}
