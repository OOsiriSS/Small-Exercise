题目要求：
给定两个字符串，请编写程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
这里规定大小写为不同字符，每个字符串中的词以空格分隔。
给定一个string stringA和一个string stringB，请返回一个bool，代表两串是否重新排列后可相同。
保证两串的长度都小于等于5000。
示例：
字符串：stringA = "This is new computer"
	  stringB = "is This new computer"
输出：true

字符串：stringA = "Here you are"
	  stringB = "Are you here"
输出：false