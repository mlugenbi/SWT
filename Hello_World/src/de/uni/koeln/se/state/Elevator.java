package de.uni.koeln.se.state;


public class Elevator{
	
	public static int current_Floor=5;
	int dest_Floor;
	
	private Elv_States State = new Elv_States();
	
	public Elevator (int dest_floor)
	{
		this.dest_Floor=dest_floor;
	System.out.println("*** Destination floor is: "+ dest_Floor);
	System.out.println("---");
	arrive_atFloor();


	}

	private void arrive_atFloor() {
		
		while(current_Floor != dest_Floor ) {
			
			if(current_Floor > dest_Floor) {
				
				System.out.println("Current floor is " + current_Floor);
				State.CurrentState = State.Moving_down;
				current_Floor--;
				
			}else {
				
				System.out.println("Current floor is " + current_Floor);
				State.CurrentState = State.Moving_up;
				current_Floor++;
			}
			
			System.out.println("Current state is " + State.CurrentState);
			System.out.println("---");
		}
		
		System.out.println("Current floor is " + current_Floor);
		State.CurrentState = State.Idle;
		System.out.println("Current state is " + State.CurrentState);

		
		
		
	}

	
}
