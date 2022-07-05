export function correctTail(body: string, tail: string): boolean{
  const sub = body.substr(body.length - 1);
  
  if (sub === tail){
    return true
  }
  else {
    return false
}
  
}
