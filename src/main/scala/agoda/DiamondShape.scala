case class DiamondShape(size: Int) {

 var diamond = new StringBuilder

  def getDiamond: String = diamond.toString


  def printDiamond: Unit = {
  println(diamond)

}

for(i<- -size/2 to size/2){
for(j<- -size/2 to size/2){
if(Math.abs(i)+Math.abs(j)<= size/2){
diamond +='+'

}
else{
diamond +=' '
}
}
diamond +='\n'
}
}



