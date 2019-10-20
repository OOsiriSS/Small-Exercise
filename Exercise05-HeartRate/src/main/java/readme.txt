题目要求：
计算卡蒙内心率，公式如下：
TargetHeartRate =(((220 - Age) - RestingHR) * Intensity) + RestingHR
其中，Intensity的取值为55%，60%，65%，70%，75%，80%，85%，90%，95%。使用英文标点符号，所有浮点数使用double存储，所有输入输出的数值均对小数部分四舍五入转化为整数。

示例:
输出：	RestingHR:
输入：	65 
输出：	Age:
输入：	22 
输出：	Intensity|TargetHeartRate
		---------|---------------
		55%      |138bpm
		60%      |145bpm
		65%      |151bpm
		70%      |158bpm
		75%      |165bpm
		80%      |171bpm
		85%      |178bpm
		90%      |185bpm
		95%      |191bpm