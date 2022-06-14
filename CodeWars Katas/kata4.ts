const min = (list: number[]): number => {
    let smallest: number =  list[0]
    for(let i: number = 0; i < list.length; i++) {
        if(list[i] < smallest)
        smallest = list[i];
    }
    return smallest
}

let minimumArray: number[];
minimumArray = [4,6,2,1,9,63,-134,566];
min(minimumArray)


const max = (list: number[]): number => {
    let largest: number = list[0];
    for(let i: number = 0; i < list.length; i++) {
        if(list[i] > largest) {
            largest = list[i];
        }
    }
    return largest
}

let maximumArray: number[]
maximumArray = [4,6,2,1,9,63,-134,566]

max(maximumArray)