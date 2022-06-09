 export function doubleChar(str: string): string{
  // Your code here
   let doubledString: string = "";
   for(let i:number = 0; i < str.length; i++) {
     doubledString += str[i] + str[i]
   }
   return doubledString
}
