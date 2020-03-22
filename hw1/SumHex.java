public class SumHex {
	public static void main(String[] args) {
		int result = 0;
		for (int i = 0; i < args.length; i++) {
			args[i] = args[i].toLowerCase();
			for (int j = 0; j < args[i].length(); j++) {
				if (Character.isWhitespace(args[i].charAt(j))) {
					continue;
				}
				int ind = j;
				while (ind < args[i].length() && !Character.isWhitespace(args[i].charAt(ind))) {
					ind++;
				}
				if (ind - j >= 2 && args[i].substring(j, j + 2).equals("0x")) {
					result += Integer.parseUnsignedInt(args[i].substring(j + 2, ind), 16);
				} else {
					result += Integer.parseInt(args[i].substring(j, ind));
				}
				j = ind;
			}
		}
		System.out.println(result);
	}
}