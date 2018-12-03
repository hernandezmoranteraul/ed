using NUnit.Framework;
using System;
namespace CVector
{
    [TestFixture()]
    public class NUnitTestClass
    {
        [Test()]
        public void BinarySearch()
        {
            Assert.AreEqual(-2, Vector.BinarySearch(new int[] { 45 }, 33));
        }
    }
}
