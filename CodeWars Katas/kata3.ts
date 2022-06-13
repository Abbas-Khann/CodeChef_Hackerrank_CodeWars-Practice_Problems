export function squareOrSquareRoot(array:number[]) : number[] {
    let newArray: number[]
    newArray = array.map((num) => {
        return Math.sqrt(num) ? num * num : Math.sqrt(num)
    })
    return newArray
}


const arr: number[] = [4,3,9,7,2,1]
squareOrSquareRoot(arr)