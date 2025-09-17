
public class enums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Day day = Day.FRIDAY;
			
//		System.out.println(day);
//		System.out.println(day.getDatNum());
		
//		switch (day) {
//		case MONDAY, TUESDAY, WEDNESDAY, THURSDAY: {
//			System.out.println("It's a week day!");
//			break;
//		}
//		case SUNDAY: {
//			System.out.println("It's a Holiday!");
//			break;
//		}
//		case SATURDAY: {
//			System.out.println("It's a weekend!");
//			break;
//			
//		}
//		default:
//			System.out.println("These day doesn't exist! :(");
//			break;
//		}
		switch (day) {
		case MONDAY, TUESDAY, WEDNESDAY, THURSDAY -> System.out.println("It's a week day!");
		case SATURDAY -> System.out.println("It's a Weekend!");
		case SUNDAY -> System.out.println("It's a Holiday");
		default -> System.out.println("The day does'nt exist");
		
		}
		
	}

}
