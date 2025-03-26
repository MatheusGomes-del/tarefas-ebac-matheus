public class TaskCasting {

    private  int num; //variável primitva


	public  TaskCasting(int numConsole) {
	   this.num = numConsole;
	}


	public Integer doCasting() {
		Integer numInt =  num; // variável primitiva em wrapper
        return numInt;
	}
}
