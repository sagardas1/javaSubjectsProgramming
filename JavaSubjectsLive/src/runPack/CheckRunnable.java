package runPack;

import java.util.HashMap;
import java.util.Map;

public class CheckRunnable {

	public static void main(String[] args) {

		Runnable runnable = () -> {
			InvestigationsService investigationsService = new InvestigationsService();
			Map<String, Integer> map = new HashMap<>();
			map.put("sagar", 1);

			investigationsService.getMap(map);

		};
		Thread thread = new Thread(runnable);
		thread.start();
	}

}
