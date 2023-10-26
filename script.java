function convertText() {
    const userText = document.getElementById("inputText").value;
    const arabicList = ['أ', 'ب', 'ت', 'ث', 'ج', 'ح', 'خ', 'د', 'ذ', 'ر', 'ز', 'س', 'ش', 'ص', 'ض', 'ط', 'ظ', 'ع', 'غ', 'ف', 'ق', 'ك', 'ل', 'م', 'ن', 'ه', 'و', 'ي'];
    const undottedList = ['ا', 'پ', 'ٺ', 'ٽ', 'چ', 'ځ', 'څ', 'ڍ', 'ڏ', 'ڔ', 'ژ', 'ښ', 'ڜ', 'ڝ', 'ڞ', 'ط', 'ڟ', 'ع', 'ڠ', 'ڣ', 'ڨ', 'گ', 'ڶ', '۾', 'ڹ', 'ۿ', 'ۋ', 'ؾ'];
    let output = "";

    for (let i = 0; i < userText.length; i++) {
        const char = userText[i];
        const index = arabicList.indexOf(char);

        if (index !== -1) {
            output += undottedList[index];
        } else {
            output += char;
        }
    }

    document.getElementById("outputText").textContent = output;
}
