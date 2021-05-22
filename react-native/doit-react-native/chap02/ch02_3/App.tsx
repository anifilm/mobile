import React from 'react'
import { SafeAreaView, Text, ScrollView } from 'react-native'

/* src/data 구현 내용 테스트
import * as D from './src/data'

const person = D.createRandomPerson()
export default function App() {
  return (
    <SafeAreaView>
    <Text>{JSON.stringify(person, null, 2)}</Text>
    </SafeAreaView>
    )
  } */

/* ClassComponent 테스트
import ClassComponent from './src/screens/ClassComponent'

export default function App() {
  return (
    <SafeAreaView>
      <Text>Use ClassComponent</Text>
      <ClassComponent />
    </SafeAreaView>
  )
} */

/* ArrowComponent 테스트
import ArrowComponent from './src/screens/ArrowComponent'

export default function App() {
  return (
    <SafeAreaView>
      <Text>Use ArrowComponent</Text>
      <ArrowComponent />
    </SafeAreaView>
  )
} */

/* Person 속성 전달
import Person from './src/screens/Person'
import * as D from './src/data'

const person = D.createRandomPerson()

export default function App() {
  return (
    <SafeAreaView>
      <Person person={person} />
    </SafeAreaView>
  )
} */

// ScrollView 적용
import Person from './src/screens/Person'
import * as D from './src/data'

const people = D.makeArray(100).map(D.createRandomPerson)

export default function App() {
  const children = people.map((person) => (
    <Person key={person.id} person={person} />
  ))
  return (
    <SafeAreaView>
      <ScrollView>{children}</ScrollView>
    </SafeAreaView>
  )
}
