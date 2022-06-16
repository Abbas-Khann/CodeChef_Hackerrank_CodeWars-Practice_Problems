const reverseWords = (str: string): string => {
    const reversedSentence: string = str.split(' ').reverse().join(' ');
    return reversedSentence;
}

const str: string = "The greatest victory is that which requires no battle"
reverseWords(str)