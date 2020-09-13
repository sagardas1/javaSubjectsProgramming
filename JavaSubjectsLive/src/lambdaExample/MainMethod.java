package lambdaExample;

public class MainMethod {
	public static void main(String[] args) {
		MyLambda lambda=(a,b)->a*b;
		System.out.println(lambda.mul(5, 5));
	}

}
