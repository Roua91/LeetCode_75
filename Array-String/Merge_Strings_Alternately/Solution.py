from itertools import izip_longest as zip_longest

class Solution(object):
    def mergeAlternately(self, word1, word2):
        """zip_longest: combines the characters of word1 and word2 into pairs
        filling in missing characters with an empty string. 
        """

        zipped = zip_longest(word1, word2, fillvalue='')

        # Concatenate the characters from each pair of words
        merged = [a + b for a, b in zipped]

        result = ''.join(merged)
        
        return result
