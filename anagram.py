def anagram(strA, strB):
	if len(strA) != len(strB):
		return False
	str1_list = list(strA);
	str1_list.sort()
	str2_list = list(strB);
	str2_list.sort()
	if str1_list == str2_list:
		return True
	else:
		return False

#return sorted(str1) == sorted(str2)


def anagram_List(str_list):
	for index_A in range(0, len(str_list)):
		strA = str_list[index_A]
		for index_B in range(index_A+1, len(str_list)):
			strB = str_list[index_B]
			if (anagram(strA,strB)):
				print("exists")
				return
	print('does not exist')


anagram_List(["ary","mary", "cat", "tim"])