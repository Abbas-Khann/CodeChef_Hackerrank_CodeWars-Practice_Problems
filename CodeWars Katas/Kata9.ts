export function warnTheSheep(queue: string[]): string {
  let message: string = '';
  for(let i: number = 0; i < queue.length; i++) {
    if(queue.slice(-1)[0] === 'wolf') {
      return message = 'Pls go away and stop eating my sheep';
    }
    else if(queue[i] === 'wolf') {
        return message = `Oi! Sheep number ${queue.reverse().indexOf('wolf')}! You are about to be eaten by a wolf!`
    }
  }
  return message ;
}
