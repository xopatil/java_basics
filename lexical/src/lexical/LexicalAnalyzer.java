package lexical;

import java.util.*;
import java.util.regex.*;

public class LexicalAnalyzer {
	// Define Java keywords
	private static final Set<String> keywords = new HashSet<>(Arrays.asList("abstract", "assert", "boolean", "break",
			"byte", "case", "catch", "char", "class", "const", "continue", "default", "do", "double", "else", "enum",
			"extends", "final", "finally", "float", "for", "goto", "if", "implements", "import", "instanceof", "int",
			"interface", "long", "native", "new", "package", "private", "protected", "public", "return", "short",
			"static", "strictfp", "super", "switch", "synchronized", "this", "throw", "throws", "transient", "try",
			"void", "volatile", "while"));

	private static final String operatorPattern = "[+\\-*/%=<>!&|^]+";
	private static final String punctuationPattern = "[.,;(){}\\[\\]]";
	private static final String identifierPattern = "[a-zA-Z_][a-zA-Z0-9_]*";
	private static final String literalPattern = "\".*?\"|\\d+(\\.\\d+)?";

	public static void analyze(String code) {
		// Use LinkedHashMap to maintain insertion order
		Map<String, Set<String>> lexemeTokens = new LinkedHashMap<>();
		lexemeTokens.put("Keyword", new LinkedHashSet<>());
		lexemeTokens.put("Identifier", new LinkedHashSet<>());
		lexemeTokens.put("Punctuation", new LinkedHashSet<>());
		lexemeTokens.put("Operator", new LinkedHashSet<>());
		lexemeTokens.put("Literal", new LinkedHashSet<>());

		Map<String, Integer> lexemeCount = new HashMap<>();
		lexemeCount.put("Keyword", 0);
		lexemeCount.put("Identifier", 0);
		lexemeCount.put("Punctuation", 0);
		lexemeCount.put("Operator", 0);
		lexemeCount.put("Literal", 0);

		List<String> tokens = new ArrayList<>();
		Matcher matcher = Pattern.compile(
				"" + identifierPattern + "|" + operatorPattern + "|" + punctuationPattern + "|" + literalPattern)
				.matcher(code);

		while (matcher.find()) {
			String token = matcher.group();
			tokens.add(token);

			if (keywords.contains(token)) {
				lexemeCount.put("Keyword", lexemeCount.get("Keyword") + 1);
				lexemeTokens.get("Keyword").add(token);
			} else if (token.matches(operatorPattern)) {
				lexemeCount.put("Operator", lexemeCount.get("Operator") + 1);
				lexemeTokens.get("Operator").add(token);
			} else if (token.matches(punctuationPattern)) {
				lexemeCount.put("Punctuation", lexemeCount.get("Punctuation") + 1);
				lexemeTokens.get("Punctuation").add(token);
			} else if (token.matches(literalPattern)) {
				lexemeCount.put("Literal", lexemeCount.get("Literal") + 1);
				lexemeTokens.get("Literal").add(token);
			} else {
				lexemeCount.put("Identifier", lexemeCount.get("Identifier") + 1);
				lexemeTokens.get("Identifier").add(token);
			}
		}

		// Displaying lexeme table
		System.out.println("\nLexeme Analysis Table:");
		System.out.printf("%-12s %-10s %-30s\n", "Lexeme Type", "Count", "Tokens");
		System.out.println("--------------------------------------------------");
		for (Map.Entry<String, Integer> entry : lexemeCount.entrySet()) {
			String lexemeType = entry.getKey();
			System.out.printf("%-12s %-10d %-30s\n", lexemeType, entry.getValue(),
					String.join(", ", lexemeTokens.get(lexemeType)));
		}
	}

	public static void main(String[] args) {
		String sampleCode = "public class SampleCode {\n" + "    public static void main(String[] args) {\n"
				+ "        int a = 5;\n" + "        int b = 10;\n" + "        int sum = a + b;\n" + "        \n"
				+ "        if (sum > 10) {\n" + "            System.out.println(\"Sum is greater than 10\");\n"
				+ "        } else {\n" + "            System.out.println(\"Sum is 10 or less\");\n" + "        }\n"
				+ "    }\n" + "}";
		System.out.println("Sample Java Code: \n" + sampleCode);
		analyze(sampleCode);
	}
}